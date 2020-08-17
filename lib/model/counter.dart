import 'package:mobx/mobx.dart';

part 'counter.g.dart';

class Counter = _Counter with _$Counter;

abstract class _Counter with Store {
  @observable
  int value = 0;

  @action
  void increment() {
    value++;
  }

  @action
  void decrement() {
    value--;
  }

  @computed
  int get total => value + 1;

  @computed
  int get sum {
    return value + 2;
  }
}