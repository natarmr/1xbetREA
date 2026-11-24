.class public final La/hmi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/rki;


# direct methods
.method public constructor <init>(La/rki;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hmi;->a:La/rki;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 24

    .line 1
    new-instance v0, La/hl60;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/hmi;->a:La/rki;

    .line 6
    .line 7
    iget-object v1, v1, La/rki;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/imi;

    .line 10
    .line 11
    iget-object v2, v1, La/imi;->a:La/sp4;

    .line 12
    .line 13
    iget-object v2, v2, La/sp4;->a:La/b9i;

    .line 14
    .line 15
    invoke-virtual {v2}, La/b9i;->n()La/gxu;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v11, v1, La/imi;->a:La/sp4;

    .line 20
    .line 21
    new-instance v3, La/rek0;

    .line 22
    .line 23
    const/16 v4, 0x1c

    .line 24
    .line 25
    invoke-direct {v3, v4}, La/rek0;-><init>(B)V

    .line 26
    .line 27
    .line 28
    iget-object v4, v11, La/sp4;->a:La/b9i;

    .line 29
    .line 30
    invoke-virtual {v4}, La/b9i;->l()La/epc;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    new-instance v5, La/yo4;

    .line 35
    .line 36
    iget-object v6, v1, La/imi;->b:La/kt2;

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    invoke-direct {v5, v6, v7}, La/yo4;-><init>(La/kt2;B)V

    .line 40
    .line 41
    .line 42
    iget-object v7, v1, La/imi;->c:La/d1p;

    .line 43
    .line 44
    invoke-interface {v7}, La/d1p;->b()La/s64;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    move-object v9, v7

    .line 49
    invoke-interface {v9}, La/d1p;->w()La/zr1;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    move-object v10, v8

    .line 54
    new-instance v8, La/ort;

    .line 55
    .line 56
    iget-object v12, v1, La/imi;->d:La/gst0;

    .line 57
    .line 58
    const/4 v13, 0x3

    .line 59
    invoke-direct {v8, v12, v13}, La/ort;-><init>(La/gst0;B)V

    .line 60
    .line 61
    .line 62
    move-object v12, v9

    .line 63
    iget-object v9, v1, La/imi;->e:La/uyu;

    .line 64
    .line 65
    move-object v13, v10

    .line 66
    new-instance v10, La/nyb;

    .line 67
    .line 68
    iget-object v14, v11, La/sp4;->a:La/b9i;

    .line 69
    .line 70
    invoke-virtual {v14}, La/b9i;->x()La/ts4;

    .line 71
    .line 72
    .line 73
    move-result-object v14

    .line 74
    invoke-direct {v10, v14}, La/nyb;-><init>(La/ts4;)V

    .line 75
    .line 76
    .line 77
    move-object v14, v12

    .line 78
    iget-object v12, v1, La/imi;->f:La/rou;

    .line 79
    .line 80
    move-object v15, v13

    .line 81
    iget-object v13, v1, La/imi;->g:La/zn00;

    .line 82
    .line 83
    move-object/from16 v16, v14

    .line 84
    .line 85
    iget-object v14, v1, La/imi;->h:La/z4w0;

    .line 86
    .line 87
    move-object/from16 v17, v0

    .line 88
    .line 89
    iget-object v0, v1, La/imi;->i:Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    move/from16 p0, v0

    .line 96
    .line 97
    iget-object v0, v1, La/imi;->j:La/i1w0;

    .line 98
    .line 99
    move-object/from16 v18, v0

    .line 100
    .line 101
    iget-object v0, v1, La/imi;->k:La/ctf0;

    .line 102
    .line 103
    move-object/from16 v19, v0

    .line 104
    .line 105
    iget-object v0, v1, La/imi;->l:La/mi70;

    .line 106
    .line 107
    move-object/from16 v20, v0

    .line 108
    .line 109
    new-instance v0, La/myb;

    .line 110
    .line 111
    move-object/from16 v21, v2

    .line 112
    .line 113
    iget-object v2, v11, La/sp4;->a:La/b9i;

    .line 114
    .line 115
    invoke-virtual {v2}, La/b9i;->x()La/ts4;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-direct {v0, v2}, La/myb;-><init>(La/ts4;)V

    .line 120
    .line 121
    .line 122
    iget-object v2, v1, La/imi;->m:La/mne;

    .line 123
    .line 124
    invoke-interface/range {v16 .. v16}, La/d1p;->j()La/ik4;

    .line 125
    .line 126
    .line 127
    move-result-object v16

    .line 128
    move-object/from16 v22, v0

    .line 129
    .line 130
    new-instance v0, La/vd1;

    .line 131
    .line 132
    move-object/from16 v23, v2

    .line 133
    .line 134
    const/4 v2, 0x4

    .line 135
    invoke-direct {v0, v6, v2}, La/vd1;-><init>(La/kt2;B)V

    .line 136
    .line 137
    .line 138
    iget-object v1, v1, La/imi;->n:La/duj;

    .line 139
    .line 140
    move-object/from16 v2, v22

    .line 141
    .line 142
    move-object/from16 v22, v0

    .line 143
    .line 144
    move-object/from16 v0, v17

    .line 145
    .line 146
    move-object/from16 v17, v19

    .line 147
    .line 148
    move-object/from16 v19, v2

    .line 149
    .line 150
    move-object v6, v15

    .line 151
    move-object/from16 v2, v21

    .line 152
    .line 153
    move/from16 v15, p0

    .line 154
    .line 155
    move-object/from16 v21, v16

    .line 156
    .line 157
    move-object/from16 v16, v18

    .line 158
    .line 159
    move-object/from16 v18, v20

    .line 160
    .line 161
    move-object/from16 v20, v23

    .line 162
    .line 163
    move-object/from16 v23, v1

    .line 164
    .line 165
    move-object/from16 v1, p1

    .line 166
    .line 167
    invoke-direct/range {v0 .. v23}, La/hl60;-><init>(La/vzg0;La/gxu;La/rek0;La/epc;La/yo4;La/s64;La/zr1;La/ort;La/uyu;La/nyb;La/sp4;La/rou;La/zn00;La/z4w0;ZLa/i1w0;La/ctf0;La/mi70;La/myb;La/mne;La/ik4;La/vd1;La/duj;)V

    .line 168
    .line 169
    .line 170
    return-object v0
.end method
