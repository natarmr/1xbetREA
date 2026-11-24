.class public final synthetic La/ugg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vgg;


# direct methods
.method public synthetic constructor <init>(La/vgg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ugg;->a:B

    iput-object p1, p0, La/ugg;->b:La/vgg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ugg;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ugg;->b:La/vgg;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/vhg;

    .line 9
    .line 10
    sget-object v0, La/vgg;->Q1:La/qud;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v0, La/thg;->a:La/thg;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {p0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    instance-of v0, p1, La/uhg;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    check-cast p1, La/uhg;

    .line 32
    .line 33
    iget-object p1, p1, La/uhg;->a:La/hhq0;

    .line 34
    .line 35
    const-class v0, La/djg;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, La/kk0;

    .line 42
    .line 43
    invoke-direct {v1, p0, v0, p1}, La/kk0;-><init>(La/vgg;Ljava/lang/String;La/hhq0;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v1}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    iget-object p0, p0, La/vgg;->O1:La/kiu0;

    .line 50
    .line 51
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, La/aig;

    .line 56
    .line 57
    sget-object p1, La/ehg;->a:La/ehg;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, La/aig;->M(La/shg;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    :goto_1
    return-object p0

    .line 70
    :pswitch_0
    check-cast p1, La/hhq0;

    .line 71
    .line 72
    sget-object v0, La/vgg;->Q1:La/qud;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, La/vgg;->O1:La/kiu0;

    .line 78
    .line 79
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, La/aig;

    .line 84
    .line 85
    new-instance v0, La/qhg;

    .line 86
    .line 87
    invoke-direct {v0, p1}, La/qhg;-><init>(La/hhq0;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, La/aig;->M(La/shg;)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
