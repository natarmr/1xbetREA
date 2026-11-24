.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final q:La/a8z;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance p2, La/ywm0;

    .line 16
    .line 17
    const/16 p3, 0x18

    .line 18
    .line 19
    invoke-direct {p2, p0, p0, p3}, La/ywm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->q:La/a8z;

    .line 27
    .line 28
    return-void
.end method

.method private final getBinding()La/u8o0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/u8o0;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final setFirstPlayerFirstNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/u8o0;->o:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setFirstPlayerFormula(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/u8o0;->n:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setFirstPlayerSecondNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/u8o0;->p:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setFirstPlayerThirdNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/u8o0;->q:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setFirstPlayerTotalScore(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/u8o0;->r:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setSecondPlayerFirstNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/u8o0;->t:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setSecondPlayerFormula(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/u8o0;->s:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setSecondPlayerSecondNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/u8o0;->u:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setSecondPlayerThirdNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/u8o0;->v:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setSecondPlayerTotalScore(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/u8o0;->w:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setWinnerText(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/u8o0;->m:Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x4

    .line 15
    const/4 v3, 0x0

    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    move v1, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v1, v3

    .line 21
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, La/u8o0;->x:Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v2, v3

    .line 38
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-object p0, p0, La/u8o0;->x:Landroid/widget/TextView;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final u(JLa/tkz;Ljava/lang/Long;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->getBinding()La/u8o0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, La/u8o0;->m:Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 6
    .line 7
    const/4 v5, 0x4

    .line 8
    move-wide v1, p1

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    invoke-static/range {v0 .. v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;->b(Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;JLa/tkz;Ljava/lang/Long;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
