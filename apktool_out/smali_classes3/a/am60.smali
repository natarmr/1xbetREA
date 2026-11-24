.class public final synthetic La/am60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dm60;


# direct methods
.method public synthetic constructor <init>(La/dm60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/am60;->a:B

    iput-object p1, p0, La/am60;->b:La/dm60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/am60;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/am60;->b:La/dm60;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Long;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    sget-object v0, La/dm60;->P1:La/wsz;

    .line 15
    .line 16
    invoke-virtual {v1}, La/dm60;->G0()La/k3t0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, La/te8;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1}, La/te8;-><init>(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/lwk;

    .line 32
    .line 33
    sget-object v0, La/dm60;->P1:La/wsz;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, La/am60;->b:La/dm60;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v3, La/am60;

    .line 45
    .line 46
    const/4 p0, 0x2

    .line 47
    invoke-direct {v3, v2, p0}, La/am60;-><init>(La/dm60;B)V

    .line 48
    .line 49
    .line 50
    new-instance v4, La/bm60;

    .line 51
    .line 52
    invoke-direct {v4, v2, p0}, La/bm60;-><init>(La/dm60;B)V

    .line 53
    .line 54
    .line 55
    new-instance v5, La/bm60;

    .line 56
    .line 57
    const/4 p0, 0x3

    .line 58
    invoke-direct {v5, v2, p0}, La/bm60;-><init>(La/dm60;B)V

    .line 59
    .line 60
    .line 61
    const/4 v6, 0x2

    .line 62
    invoke-static/range {v1 .. v6}, La/o2t;->e(Landroidx/fragment/app/e;La/clz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/bm60;I)V

    .line 63
    .line 64
    .line 65
    new-instance p0, La/ty2;

    .line 66
    .line 67
    const/16 p1, 0x10

    .line 68
    .line 69
    invoke-direct {p0, v2, p1}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_1
    check-cast p1, La/dn60;

    .line 74
    .line 75
    sget-object p0, La/dm60;->P1:La/wsz;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, La/dm60;->G0()La/k3t0;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    new-instance v0, La/af8;

    .line 85
    .line 86
    invoke-direct {v0, p1}, La/af8;-><init>(La/dn60;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
