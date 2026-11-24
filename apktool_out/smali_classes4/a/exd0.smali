.class public final synthetic La/exd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hxd0;


# direct methods
.method public synthetic constructor <init>(La/hxd0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/exd0;->a:B

    iput-object p1, p0, La/exd0;->b:La/hxd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/exd0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/exd0;->b:La/hxd0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object p0, p0, La/hxd0;->E:La/ol60;

    .line 15
    .line 16
    new-instance v0, La/xwd0;

    .line 17
    .line 18
    invoke-direct {v0, p1}, La/xwd0;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, La/hxd0;->k:La/g2v;

    .line 33
    .line 34
    iget-object v1, p0, La/hxd0;->b:Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;

    .line 35
    .line 36
    iget-wide v1, v1, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->b:J

    .line 37
    .line 38
    sget-object v3, La/pb10;->v:La/pb10;

    .line 39
    .line 40
    invoke-static {v1, v2, v3}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sget-object v3, La/ldm;->b:La/ldm;

    .line 45
    .line 46
    iget-object v2, p0, La/hxd0;->I:La/p7m0;

    .line 47
    .line 48
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, La/da10;

    .line 53
    .line 54
    iget-short v2, v2, La/da10;->a:S

    .line 55
    .line 56
    int-to-long v9, v2

    .line 57
    const-wide/16 v11, 0x0

    .line 58
    .line 59
    const/16 v13, 0x25a

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x0

    .line 64
    const v6, 0x7f130677

    .line 65
    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    const v8, 0x7f131690

    .line 69
    .line 70
    .line 71
    invoke-static/range {v0 .. v13}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v1, p0, La/hxd0;->D:La/p7m0;

    .line 76
    .line 77
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    move-object v3, v2

    .line 82
    check-cast v3, La/cxd0;

    .line 83
    .line 84
    new-instance v3, La/axd0;

    .line 85
    .line 86
    invoke-direct {v3, v0}, La/axd0;-><init>(La/mdm;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_0

    .line 94
    .line 95
    iget-object p0, p0, La/hxd0;->c:La/duj;

    .line 96
    .line 97
    new-instance v0, La/ksc0;

    .line 98
    .line 99
    const/16 v1, 0x12

    .line 100
    .line 101
    invoke-direct {v0, v1}, La/ksc0;-><init>(B)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
