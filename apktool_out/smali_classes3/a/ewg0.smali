.class public final synthetic La/ewg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/ytg0;

.field public final synthetic b:D

.field public final synthetic c:D

.field public final synthetic d:La/ytg0;

.field public final synthetic e:D

.field public final synthetic f:D

.field public final synthetic g:La/wvg0;


# direct methods
.method public synthetic constructor <init>(La/ytg0;DDLa/ytg0;DDLa/wvg0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ewg0;->a:La/ytg0;

    iput-wide p2, p0, La/ewg0;->b:D

    iput-wide p4, p0, La/ewg0;->c:D

    iput-object p6, p0, La/ewg0;->d:La/ytg0;

    iput-wide p7, p0, La/ewg0;->e:D

    iput-wide p9, p0, La/ewg0;->f:D

    iput-object p11, p0, La/ewg0;->g:La/wvg0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/oyg0;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, La/svg0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-wide/16 v6, 0x0

    .line 18
    .line 19
    const/16 v10, 0x1ef7

    .line 20
    .line 21
    iget-object v3, v0, La/ewg0;->a:La/ytg0;

    .line 22
    .line 23
    iget-wide v4, v0, La/ewg0;->b:D

    .line 24
    .line 25
    iget-wide v8, v0, La/ewg0;->c:D

    .line 26
    .line 27
    invoke-static/range {v3 .. v10}, La/ytg0;->a(La/ytg0;DDDI)La/ytg0;

    .line 28
    .line 29
    .line 30
    move-result-object v24

    .line 31
    move-wide v6, v8

    .line 32
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-string v4, "KEY_MAX_BET_VALUE"

    .line 37
    .line 38
    invoke-static {v1, v3, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, La/ewg0;->d:La/ytg0;

    .line 42
    .line 43
    iget-wide v8, v3, La/ytg0;->h:D

    .line 44
    .line 45
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "KEY_MIN_BET_VALUE"

    .line 50
    .line 51
    invoke-static {v1, v4, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-wide v4, v3, La/ytg0;->f:D

    .line 55
    .line 56
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    const-string v11, "KEY_AUTO_SALE_MIN_VALUE"

    .line 61
    .line 62
    invoke-static {v1, v10, v11}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-wide v10, v3, La/ytg0;->g:D

    .line 66
    .line 67
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const-string v12, "KEY_AUTO_SALE_MAX_VALUE"

    .line 72
    .line 73
    invoke-static {v1, v3, v12}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-wide v12, v0, La/ewg0;->e:D

    .line 77
    .line 78
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const-string v14, "KEY_PAYMENT_VALUE"

    .line 83
    .line 84
    invoke-static {v1, v3, v14}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-wide v14, v0, La/ewg0;->f:D

    .line 88
    .line 89
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    move-object/from16 p1, v2

    .line 94
    .line 95
    const-string v2, "KEY_AUTO_SALE_VALUE"

    .line 96
    .line 97
    invoke-static {v1, v3, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const/16 v27, 0x0

    .line 101
    .line 102
    const v28, 0x7e3c07

    .line 103
    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    move-wide/from16 v16, v4

    .line 107
    .line 108
    const/4 v4, 0x0

    .line 109
    const/4 v5, 0x0

    .line 110
    move-wide/from16 v18, v10

    .line 111
    .line 112
    const-wide/16 v10, 0x0

    .line 113
    .line 114
    const/16 v20, 0x0

    .line 115
    .line 116
    const/16 v21, 0x0

    .line 117
    .line 118
    sget-object v22, La/wtg0;->a:La/wtg0;

    .line 119
    .line 120
    iget-object v0, v0, La/ewg0;->g:La/wvg0;

    .line 121
    .line 122
    const/16 v25, 0x0

    .line 123
    .line 124
    const/16 v26, 0x0

    .line 125
    .line 126
    move-object/from16 v2, p1

    .line 127
    .line 128
    move-object/from16 v23, v0

    .line 129
    .line 130
    invoke-static/range {v2 .. v28}, La/svg0;->a(La/svg0;FFFDDDDDDDZZLa/xtg0;La/wvg0;La/ytg0;La/ql5;Ljava/util/List;Ljava/util/List;I)La/svg0;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0
.end method
