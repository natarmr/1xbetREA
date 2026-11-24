.class public final synthetic La/ghd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ym6;


# direct methods
.method public synthetic constructor <init>(La/ym6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ghd;->a:B

    iput-object p1, p0, La/ghd;->b:La/ym6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ghd;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/ghd;->b:La/ym6;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p1

    .line 11
    .line 12
    check-cast v2, La/fhl;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-boolean v0, v0, La/ym6;->e:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 22
    .line 23
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 28
    .line 29
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary60-0d7_KjU()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    :goto_0
    move-wide v3, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 36
    .line 37
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 42
    .line 43
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSeparator-0d7_KjU()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    goto :goto_0

    .line 48
    :goto_1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 49
    .line 50
    const/high16 v0, 0x41400000    # 12.0f

    .line 51
    .line 52
    invoke-interface {v2, v0}, La/w6k;->w0(F)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    int-to-long v5, v1

    .line 61
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    int-to-long v0, v0

    .line 66
    const/16 v7, 0x20

    .line 67
    .line 68
    shl-long/2addr v5, v7

    .line 69
    const-wide v7, 0xffffffffL

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    and-long/2addr v0, v7

    .line 75
    or-long v9, v5, v0

    .line 76
    .line 77
    new-instance v11, La/vtm0;

    .line 78
    .line 79
    const/high16 v0, 0x3f800000    # 1.0f

    .line 80
    .line 81
    invoke-interface {v2, v0}, La/w6k;->w0(F)F

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    const/16 v17, 0x1e

    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const/4 v14, 0x0

    .line 91
    const/4 v15, 0x0

    .line 92
    invoke-direct/range {v11 .. v17}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 93
    .line 94
    .line 95
    const/16 v12, 0xe6

    .line 96
    .line 97
    const-wide/16 v5, 0x0

    .line 98
    .line 99
    const-wide/16 v7, 0x0

    .line 100
    .line 101
    invoke-static/range {v2 .. v12}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 102
    .line 103
    .line 104
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_0
    move-object/from16 v1, p1

    .line 108
    .line 109
    check-cast v1, La/pi9;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    new-instance v2, La/ghd;

    .line 115
    .line 116
    const/4 v3, 0x1

    .line 117
    invoke-direct {v2, v0, v3}, La/ghd;-><init>(La/ym6;B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v2}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
