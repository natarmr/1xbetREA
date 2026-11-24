.class public final La/u3k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n4d;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u3k;->a:B

    iput-object p1, p0, La/u3k;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 5

    .line 1
    iget-byte v0, p0, La/u3k;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/u3k;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/s8l0;

    .line 9
    .line 10
    iget-boolean p0, p0, La/s8l0;->d:Z

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 15
    .line 16
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 24
    .line 25
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 30
    .line 31
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    :goto_0
    return-wide v0

    .line 36
    :pswitch_0
    check-cast p0, La/ncg0;

    .line 37
    .line 38
    iget-wide v0, p0, La/ncg0;->c:J

    .line 39
    .line 40
    return-wide v0

    .line 41
    :pswitch_1
    check-cast p0, La/m3w;

    .line 42
    .line 43
    iget-wide v0, p0, La/m3w;->c:J

    .line 44
    .line 45
    return-wide v0

    .line 46
    :pswitch_2
    check-cast p0, La/v3k;

    .line 47
    .line 48
    iget-object v0, p0, La/v3k;->t:La/u3k;

    .line 49
    .line 50
    iget-object v0, v0, La/u3k;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, La/ncg0;

    .line 53
    .line 54
    iget-wide v0, v0, La/ncg0;->c:J

    .line 55
    .line 56
    const-wide/16 v2, 0x10

    .line 57
    .line 58
    cmp-long v4, v0, v2

    .line 59
    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    sget-object v0, La/lcg0;->a:La/zfn;

    .line 64
    .line 65
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, La/icg0;

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iget-wide v0, v0, La/icg0;->a:J

    .line 74
    .line 75
    cmp-long v2, v0, v2

    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    sget-object v0, La/yde;->a:La/zfn;

    .line 81
    .line 82
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, La/y3d;

    .line 87
    .line 88
    iget-wide v0, p0, La/y3d;->a:J

    .line 89
    .line 90
    :goto_1
    return-wide v0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
