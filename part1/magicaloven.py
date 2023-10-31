class MagicalOven:
  def __init__(self):
    self.ingredients = []
    self.temperature = "Warm"
  
  def add(self, item):
    self.ingredients.append(item)
  
  def freeze(self):
    self.temperature = "Cold"
  
  def boil(self):
    self.temperature = "Hot"

  def wait(self):
    pass

  def get_output(self):
    if self.temperature == "Cold" and ["water", "air"] == self.ingredients:
      return "snow"
    elif self.temperature == "Hot":
      if ["lead", "mercury"] == self.ingredients:
        return "gold"
      elif ["cheese", "dough", "tomato"] == self.ingredients:
        return "pizza"
    else:
      return "The magical oven don't recognize this combination"