.class public final La/shk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;

.field public final b:La/cy40;


# direct methods
.method public constructor <init>(Landroid/content/res/Configuration;ZLa/tkz;)V
    .locals 14

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ahk;

    .line 5
    .line 6
    iget v2, p1, Landroid/content/res/Configuration;->densityDpi:I

    .line 7
    .line 8
    int-to-float v2, v2

    .line 9
    const/high16 v3, 0x43200000    # 160.0f

    .line 10
    .line 11
    div-float/2addr v2, v3

    .line 12
    iget v3, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 13
    .line 14
    new-instance v4, La/z6k;

    .line 15
    .line 16
    invoke-direct {v4, v2, v3}, La/z6k;-><init>(FF)V

    .line 17
    .line 18
    .line 19
    new-instance v5, La/t9o0;

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    move v7, v6

    .line 23
    move v8, v6

    .line 24
    move v9, v6

    .line 25
    move v10, v6

    .line 26
    move v11, v6

    .line 27
    move v12, v6

    .line 28
    move v13, v6

    .line 29
    invoke-direct/range {v5 .. v13}, La/t9o0;-><init>(FFFFFFFF)V

    .line 30
    .line 31
    .line 32
    new-instance v2, La/sly;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct {v2, v6, v6, v3}, La/sly;-><init>(FFZ)V

    .line 36
    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    move-object v1, v5

    .line 40
    move-object v5, v2

    .line 41
    move-object v2, v4

    .line 42
    move-object v4, v1

    .line 43
    move-object v1, p1

    .line 44
    move/from16 v6, p2

    .line 45
    .line 46
    invoke-direct/range {v0 .. v6}, La/ahk;-><init>(Landroid/content/res/Configuration;La/w6k;La/erq;La/t9o0;La/sly;Z)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/shk;->a:La/p7m0;

    .line 54
    .line 55
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, La/ahk;

    .line 60
    .line 61
    invoke-static {v1}, La/dwk;->a(La/ahk;)La/bwk;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v4, La/cy40;

    .line 66
    .line 67
    invoke-direct {v4, v1}, La/cy40;-><init>(La/bwk;)V

    .line 68
    .line 69
    .line 70
    iput-object v4, p0, La/shk;->b:La/cy40;

    .line 71
    .line 72
    new-instance p0, La/h2c;

    .line 73
    .line 74
    const/4 v10, 0x4

    .line 75
    invoke-direct {p0, v0, v10}, La/h2c;-><init>(La/p7m0;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0}, La/i120;->W(La/gmq;)La/gmq;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance v2, La/d7e;

    .line 83
    .line 84
    const/4 v8, 0x4

    .line 85
    const/16 v9, 0x1c

    .line 86
    .line 87
    const/4 v3, 0x2

    .line 88
    const-class v5, La/cy40;

    .line 89
    .line 90
    const-string v6, "update"

    .line 91
    .line 92
    const-string v7, "update(Lorg/xplatform/uikit/compose/utils/display/model/display/DisplayState;)V"

    .line 93
    .line 94
    invoke-direct/range {v2 .. v9}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 95
    .line 96
    .line 97
    new-instance v0, La/fnq;

    .line 98
    .line 99
    invoke-direct {v0, p0, v2, v10}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 100
    .line 101
    .line 102
    sget-object p0, La/kpj0;->a:La/j6m0;

    .line 103
    .line 104
    move-object/from16 v2, p3

    .line 105
    .line 106
    invoke-static {v0, v2, p0, v1}, La/vtb;->h0(La/gmq;La/vne;La/lpj0;Ljava/lang/Object;)La/xae0;

    .line 107
    .line 108
    .line 109
    return-void
.end method
