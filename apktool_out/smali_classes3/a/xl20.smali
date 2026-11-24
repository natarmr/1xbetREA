.class public final synthetic La/xl20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:D

.field public final synthetic b:La/sbq;

.field public final synthetic c:La/j43;

.field public final synthetic d:D

.field public final synthetic e:D


# direct methods
.method public synthetic constructor <init>(DLa/sbq;La/j43;DD)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/xl20;->a:D

    iput-object p3, p0, La/xl20;->b:La/sbq;

    iput-object p4, p0, La/xl20;->c:La/j43;

    iput-wide p5, p0, La/xl20;->d:D

    iput-wide p7, p0, La/xl20;->e:D

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

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
    check-cast v2, La/sg20;

    .line 10
    .line 11
    iget-object v3, v2, La/sg20;->e:La/qvj0;

    .line 12
    .line 13
    iget-object v1, v3, La/qvj0;->a:La/cx6;

    .line 14
    .line 15
    iget-object v4, v1, La/cx6;->b:La/uw6;

    .line 16
    .line 17
    iget-wide v5, v0, La/xl20;->a:D

    .line 18
    .line 19
    const-wide/16 v21, 0x0

    .line 20
    .line 21
    cmpg-double v7, v5, v21

    .line 22
    .line 23
    const/4 v8, 0x1

    .line 24
    if-nez v7, :cond_0

    .line 25
    .line 26
    move v7, v8

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v7, 0x0

    .line 29
    :goto_0
    xor-int/lit8 v16, v7, 0x1

    .line 30
    .line 31
    const/16 v19, 0x0

    .line 32
    .line 33
    const/16 v20, 0x3dff

    .line 34
    .line 35
    move-wide v9, v5

    .line 36
    const-wide/16 v5, 0x0

    .line 37
    .line 38
    move v11, v8

    .line 39
    const-wide/16 v7, 0x0

    .line 40
    .line 41
    move-wide v12, v9

    .line 42
    const-wide/16 v9, 0x0

    .line 43
    .line 44
    move v15, v11

    .line 45
    move-wide v13, v12

    .line 46
    const-wide/16 v11, 0x0

    .line 47
    .line 48
    move-wide/from16 v17, v13

    .line 49
    .line 50
    const/4 v13, 0x0

    .line 51
    const/4 v14, 0x0

    .line 52
    move/from16 v23, v15

    .line 53
    .line 54
    const/4 v15, 0x0

    .line 55
    move-wide/from16 v24, v17

    .line 56
    .line 57
    const/16 v17, 0x0

    .line 58
    .line 59
    const/16 v18, 0x0

    .line 60
    .line 61
    move-object/from16 p1, v2

    .line 62
    .line 63
    move-object/from16 p2, v3

    .line 64
    .line 65
    move/from16 v2, v23

    .line 66
    .line 67
    invoke-static/range {v4 .. v20}, La/uw6;->a(La/uw6;DDDDLjava/lang/String;ZZZZZZI)La/uw6;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-static {v1, v4, v3, v2}, La/cx6;->a(La/cx6;La/a8q0;La/uw6;I)La/cx6;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    iget-object v1, v0, La/xl20;->b:La/sbq;

    .line 77
    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    iget-wide v1, v1, La/sbq;->c:D

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move-wide/from16 v1, v21

    .line 84
    .line 85
    :goto_1
    new-instance v7, La/d0d;

    .line 86
    .line 87
    move-wide/from16 v9, v24

    .line 88
    .line 89
    invoke-direct {v7, v9, v10, v1, v2}, La/d0d;-><init>(DD)V

    .line 90
    .line 91
    .line 92
    const/16 v8, 0x16

    .line 93
    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v6, 0x0

    .line 96
    move-object/from16 v3, p2

    .line 97
    .line 98
    invoke-static/range {v3 .. v8}, La/qvj0;->a(La/qvj0;La/cx6;La/lnb0;La/jwo0;La/d0d;I)La/qvj0;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    move-object/from16 v2, p1

    .line 103
    .line 104
    iget-object v3, v2, La/sg20;->b:La/ky6;

    .line 105
    .line 106
    iget-object v5, v3, La/ky6;->b:La/iur;

    .line 107
    .line 108
    const/4 v13, 0x3

    .line 109
    iget-object v6, v0, La/xl20;->c:La/j43;

    .line 110
    .line 111
    iget-wide v7, v0, La/xl20;->d:D

    .line 112
    .line 113
    iget-wide v11, v0, La/xl20;->e:D

    .line 114
    .line 115
    invoke-static/range {v5 .. v13}, La/iur;->a(La/iur;La/j43;DDDI)La/iur;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v3, v3, La/ky6;->a:La/kd5;

    .line 120
    .line 121
    new-instance v4, La/ky6;

    .line 122
    .line 123
    invoke-direct {v4, v3, v0}, La/ky6;-><init>(La/kd5;La/iur;)V

    .line 124
    .line 125
    .line 126
    const/4 v11, 0x0

    .line 127
    const/16 v12, 0x7ed

    .line 128
    .line 129
    move-object v3, v4

    .line 130
    const/4 v4, 0x0

    .line 131
    const/4 v5, 0x0

    .line 132
    const/4 v7, 0x0

    .line 133
    const/4 v8, 0x0

    .line 134
    const/4 v9, 0x0

    .line 135
    const/4 v10, 0x0

    .line 136
    move-object v6, v1

    .line 137
    invoke-static/range {v2 .. v12}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    return-object v0
.end method
