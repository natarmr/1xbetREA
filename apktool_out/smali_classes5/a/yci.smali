.class public final La/yci;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/uci;


# direct methods
.method public constructor <init>(La/uci;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/yci;->a:La/uci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 19

    .line 1
    new-instance v0, La/kzd;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/yci;->a:La/uci;

    .line 6
    .line 7
    iget-object v1, v1, La/uci;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/zci;

    .line 10
    .line 11
    iget-object v2, v1, La/zci;->a:La/i1w0;

    .line 12
    .line 13
    iget-object v3, v1, La/zci;->b:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;

    .line 14
    .line 15
    iget-object v4, v1, La/zci;->c:La/mne;

    .line 16
    .line 17
    iget-object v5, v1, La/zci;->d:La/nr;

    .line 18
    .line 19
    iget-object v6, v1, La/zci;->e:La/s64;

    .line 20
    .line 21
    iget-object v7, v1, La/zci;->f:La/zg;

    .line 22
    .line 23
    iget-object v8, v1, La/zci;->g:La/cyh;

    .line 24
    .line 25
    iget-object v9, v1, La/zci;->h:La/ort;

    .line 26
    .line 27
    iget-object v10, v1, La/zci;->i:La/zg;

    .line 28
    .line 29
    iget-object v11, v1, La/zci;->j:La/au0;

    .line 30
    .line 31
    iget-object v12, v1, La/zci;->k:La/lef0;

    .line 32
    .line 33
    iget-object v12, v12, La/lef0;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v12, La/gbi;

    .line 36
    .line 37
    move-object v13, v12

    .line 38
    new-instance v12, La/f5c;

    .line 39
    .line 40
    invoke-virtual {v13}, La/gbi;->L()La/kd30;

    .line 41
    .line 42
    .line 43
    move-result-object v13

    .line 44
    invoke-direct {v12, v13}, La/f5c;-><init>(La/kd30;)V

    .line 45
    .line 46
    .line 47
    iget-object v13, v1, La/zci;->l:La/z4w0;

    .line 48
    .line 49
    iget-object v14, v1, La/zci;->k:La/lef0;

    .line 50
    .line 51
    iget-object v15, v14, La/lef0;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v15, La/gbi;

    .line 54
    .line 55
    invoke-virtual {v15}, La/gbi;->y()La/n5c;

    .line 56
    .line 57
    .line 58
    move-result-object v15

    .line 59
    move-object/from16 v16, v15

    .line 60
    .line 61
    iget-object v15, v1, La/zci;->m:La/duj;

    .line 62
    .line 63
    move-object/from16 v17, v0

    .line 64
    .line 65
    new-instance v0, La/xzb;

    .line 66
    .line 67
    iget-object v14, v14, La/lef0;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v14, La/gbi;

    .line 70
    .line 71
    invoke-virtual {v14}, La/gbi;->L()La/kd30;

    .line 72
    .line 73
    .line 74
    move-result-object v14

    .line 75
    move-object/from16 v18, v2

    .line 76
    .line 77
    iget-object v2, v1, La/zci;->n:La/gst0;

    .line 78
    .line 79
    move-object/from16 p0, v3

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    invoke-direct {v0, v14, v2, v3}, La/xzb;-><init>(La/kd30;La/gst0;B)V

    .line 83
    .line 84
    .line 85
    iget-object v2, v1, La/zci;->o:La/m1e;

    .line 86
    .line 87
    iget-object v1, v1, La/zci;->p:La/ctf0;

    .line 88
    .line 89
    move-object/from16 v3, p0

    .line 90
    .line 91
    move-object/from16 v14, v16

    .line 92
    .line 93
    move-object/from16 v16, v0

    .line 94
    .line 95
    move-object/from16 v0, v17

    .line 96
    .line 97
    move-object/from16 v17, v2

    .line 98
    .line 99
    move-object/from16 v2, v18

    .line 100
    .line 101
    move-object/from16 v18, v1

    .line 102
    .line 103
    move-object/from16 v1, p1

    .line 104
    .line 105
    invoke-direct/range {v0 .. v18}, La/kzd;-><init>(La/vzg0;La/i1w0;Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;La/mne;La/nr;La/s64;La/zg;La/cyh;La/ort;La/zg;La/au0;La/f5c;La/z4w0;La/n5c;La/duj;La/xzb;La/m1e;La/ctf0;)V

    .line 106
    .line 107
    .line 108
    return-object v0
.end method
