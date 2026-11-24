.class public final synthetic La/wqb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wqb0;->a:B

    iput-object p1, p0, La/wqb0;->b:Landroid/content/Context;

    iput-object p2, p0, La/wqb0;->c:Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/wqb0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/wqb0;->c:Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;

    .line 4
    .line 5
    iget-object p0, p0, La/wqb0;->b:Landroid/content/Context;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget v0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->g:I

    .line 11
    .line 12
    new-instance v0, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x6

    .line 16
    invoke-direct {v0, p0, v2, v3}, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    sget v0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->g:I

    .line 24
    .line 25
    new-instance v0, Landroid/widget/ImageView;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    sget v0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->g:I

    .line 35
    .line 36
    new-instance v0, Landroid/widget/TextView;

    .line 37
    .line 38
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    const p0, 0x7f1403cd

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const v2, 0x7f0606da

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v2}, Landroid/content/Context;->getColor(I)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    .line 63
    .line 64
    const/16 p0, 0x11

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setGravity(I)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x1

    .line 70
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 74
    .line 75
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
