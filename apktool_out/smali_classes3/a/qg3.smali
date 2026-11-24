.class public final synthetic La/qg3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vg3;


# direct methods
.method public synthetic constructor <init>(La/vg3;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qg3;->a:B

    iput-object p1, p0, La/qg3;->b:La/vg3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/qg3;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/qg3;->b:La/vg3;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/vg3;->R1:La/hfk0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v0, p0, La/ij3;->j0:La/p7m0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    move-object v1, p0

    .line 22
    check-cast v1, La/jh3;

    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    const/16 v12, 0xbff

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x1

    .line 36
    invoke-static/range {v1 .. v12}, La/jh3;->a(La/jh3;La/iy3;Ljava/util/ArrayList;La/ph3;La/oc5;La/oc5;Ljava/lang/String;La/yfw;Ljava/util/Set;ZZI)La/jh3;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    new-instance v0, La/q0h0;

    .line 50
    .line 51
    iget-object p0, p0, La/vg3;->L1:La/j8i;

    .line 52
    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_1
    const-string p0, "viewModelFactory"

    .line 60
    .line 61
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :pswitch_1
    sget-object v0, La/vg3;->R1:La/hfk0;

    .line 66
    .line 67
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget-object p0, p0, La/ij3;->k0:La/p7m0;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    sget-object v0, La/rf50;->a:La/rf50;

    .line 77
    .line 78
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
