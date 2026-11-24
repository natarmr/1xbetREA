.class public final La/vhi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/ugi;


# direct methods
.method public constructor <init>(La/ugi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vhi;->a:La/ugi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 20

    .line 1
    new-instance v0, La/zns;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/vhi;->a:La/ugi;

    .line 6
    .line 7
    iget-object v1, v1, La/ugi;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/whi;

    .line 10
    .line 11
    iget-object v2, v1, La/whi;->a:La/i1w0;

    .line 12
    .line 13
    new-instance v3, La/eke0;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v4, v1, La/whi;->b:Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;

    .line 19
    .line 20
    iget-object v5, v1, La/whi;->c:La/iip;

    .line 21
    .line 22
    move-object v6, v5

    .line 23
    invoke-interface {v6}, La/iip;->W()La/rvt;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object v7, v6

    .line 31
    invoke-interface {v7}, La/iip;->f()La/svt;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v7}, La/iip;->n()La/cj9;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v8, v1, La/whi;->d:La/hru;

    .line 46
    .line 47
    iget-object v9, v1, La/whi;->e:La/sd60;

    .line 48
    .line 49
    iget-object v10, v1, La/whi;->f:La/rjo;

    .line 50
    .line 51
    iget-object v11, v1, La/whi;->g:La/wdd0;

    .line 52
    .line 53
    new-instance v12, La/bn6;

    .line 54
    .line 55
    iget-object v13, v1, La/whi;->h:La/gst0;

    .line 56
    .line 57
    iget-object v14, v1, La/whi;->i:La/kt2;

    .line 58
    .line 59
    iget-object v15, v1, La/whi;->j:La/knf0;

    .line 60
    .line 61
    move-object/from16 v18, v0

    .line 62
    .line 63
    iget-object v0, v1, La/whi;->k:La/peg0;

    .line 64
    .line 65
    const/16 v17, 0x1

    .line 66
    .line 67
    move-object/from16 v16, v0

    .line 68
    .line 69
    invoke-direct/range {v12 .. v17}, La/bn6;-><init>(La/gst0;La/kt2;La/knf0;La/peg0;B)V

    .line 70
    .line 71
    .line 72
    iget-object v13, v1, La/whi;->l:La/ix0;

    .line 73
    .line 74
    new-instance v0, La/qu;

    .line 75
    .line 76
    const/4 v15, 0x4

    .line 77
    invoke-direct {v0, v14, v15}, La/qu;-><init>(La/kt2;B)V

    .line 78
    .line 79
    .line 80
    iget-object v15, v1, La/whi;->m:La/m1e;

    .line 81
    .line 82
    iget-object v14, v1, La/whi;->n:La/bzt;

    .line 83
    .line 84
    move-object/from16 p0, v0

    .line 85
    .line 86
    iget-object v0, v1, La/whi;->o:La/mne;

    .line 87
    .line 88
    move-object/from16 v17, v0

    .line 89
    .line 90
    iget-object v0, v1, La/whi;->p:La/duj;

    .line 91
    .line 92
    iget-object v1, v1, La/whi;->q:La/ctf0;

    .line 93
    .line 94
    move-object/from16 v16, v18

    .line 95
    .line 96
    move-object/from16 v18, v0

    .line 97
    .line 98
    move-object/from16 v0, v16

    .line 99
    .line 100
    move-object/from16 v19, v1

    .line 101
    .line 102
    move-object/from16 v16, v14

    .line 103
    .line 104
    move-object/from16 v14, p0

    .line 105
    .line 106
    move-object/from16 v1, p1

    .line 107
    .line 108
    invoke-direct/range {v0 .. v19}, La/zns;-><init>(La/vzg0;La/i1w0;La/eke0;Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;La/rvt;La/svt;La/cj9;La/hru;La/sd60;La/rjo;La/wdd0;La/bn6;La/ix0;La/qu;La/m1e;La/bzt;La/mne;La/duj;La/ctf0;)V

    .line 109
    .line 110
    .line 111
    return-object v0
.end method
