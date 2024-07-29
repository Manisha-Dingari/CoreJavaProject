package com.corejavaproject.Task;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Category {
    private boolean diary;
    private boolean frozenFood;
    private boolean infantClothes;

    public Category(boolean diary, boolean frozenFood, boolean infantClothes) {
        this.diary = diary;
        this.frozenFood = frozenFood;
        this.infantClothes = infantClothes;
    }

    public void getCategory() {
        log.info("Categories are Diary:{} and Frozen Food:{} and Infant Clothes:{}", diary, frozenFood, infantClothes);
    }
}
