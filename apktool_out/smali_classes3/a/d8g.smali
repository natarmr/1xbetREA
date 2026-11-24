.class public final synthetic La/d8g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/h8g;


# direct methods
.method public synthetic constructor <init>(La/h8g;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/d8g;->a:B

    iput-object p1, p0, La/d8g;->b:La/h8g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/d8g;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/d8g;->b:La/h8g;

    .line 4
    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/h8g;->l2:La/kud;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    sget-object v0, La/h8g;->l2:La/kud;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, La/h8g;->j2:La/kiu0;

    .line 27
    .line 28
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, La/k8g;

    .line 33
    .line 34
    invoke-virtual {p0}, La/h8g;->V0()La/i8g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v0, v0, La/i8g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/container/monthpicker/numberpicker/CyberCalendarMonthPicker;

    .line 39
    .line 40
    invoke-virtual {v0}, Lorg/xplatform/cyber/calendar/impl/presentation/container/monthpicker/numberpicker/CyberCalendarMonthPicker;->getValue()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    new-instance v2, La/j8g;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v2, p1, v3}, La/j8g;-><init>(La/k8g;B)V

    .line 52
    .line 53
    .line 54
    iget-object v3, p1, La/k8g;->f:La/mne;

    .line 55
    .line 56
    iget-object v4, v3, La/mne;->a:La/rwj;

    .line 57
    .line 58
    new-instance v5, La/u52;

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v6, 0x4

    .line 62
    invoke-direct {v5, p1, v0, v3, v6}, La/u52;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 63
    .line 64
    .line 65
    const/16 v6, 0xa

    .line 66
    .line 67
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
