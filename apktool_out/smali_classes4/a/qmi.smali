.class public final La/qmi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bw60;


# instance fields
.field public final a:La/mne;

.field public final b:La/bwl;

.field public final c:La/p4u;

.field public final d:La/duj;

.field public final e:La/oeg0;

.field public final f:La/hs60;

.field public final g:La/iqt;

.field public final h:La/dcu;

.field public final i:La/as;

.field public final j:La/as;

.field public final k:La/z4u;

.field public final l:La/d1p;

.field public final m:La/pru;

.field public final n:La/hnu;

.field public final o:La/ctf0;

.field public final p:La/wdk0;

.field public final q:La/ii;


# direct methods
.method public constructor <init>(La/mne;La/duj;La/d1p;La/bwl;La/sxs0;La/wdk0;La/p4u;La/as;La/as;La/pru;La/z4u;La/dcu;La/oeg0;La/hs60;La/iqt;La/hnu;La/ctf0;La/ii;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qmi;->a:La/mne;

    .line 5
    .line 6
    iput-object p4, p0, La/qmi;->b:La/bwl;

    .line 7
    .line 8
    iput-object p7, p0, La/qmi;->c:La/p4u;

    .line 9
    .line 10
    iput-object p2, p0, La/qmi;->d:La/duj;

    .line 11
    .line 12
    iput-object p13, p0, La/qmi;->e:La/oeg0;

    .line 13
    .line 14
    iput-object p14, p0, La/qmi;->f:La/hs60;

    .line 15
    .line 16
    iput-object p15, p0, La/qmi;->g:La/iqt;

    .line 17
    .line 18
    iput-object p12, p0, La/qmi;->h:La/dcu;

    .line 19
    .line 20
    iput-object p8, p0, La/qmi;->i:La/as;

    .line 21
    .line 22
    iput-object p9, p0, La/qmi;->j:La/as;

    .line 23
    .line 24
    iput-object p11, p0, La/qmi;->k:La/z4u;

    .line 25
    .line 26
    iput-object p3, p0, La/qmi;->l:La/d1p;

    .line 27
    .line 28
    iput-object p10, p0, La/qmi;->m:La/pru;

    .line 29
    .line 30
    move-object/from16 p1, p16

    .line 31
    .line 32
    iput-object p1, p0, La/qmi;->n:La/hnu;

    .line 33
    .line 34
    move-object/from16 p1, p17

    .line 35
    .line 36
    iput-object p1, p0, La/qmi;->o:La/ctf0;

    .line 37
    .line 38
    iput-object p6, p0, La/qmi;->p:La/wdk0;

    .line 39
    .line 40
    move-object/from16 p1, p18

    .line 41
    .line 42
    iput-object p1, p0, La/qmi;->q:La/ii;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a()La/nn60;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, La/nn60;

    .line 4
    .line 5
    iget-object v2, v0, La/qmi;->b:La/bwl;

    .line 6
    .line 7
    iget-object v2, v2, La/bwl;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/dbi;

    .line 10
    .line 11
    invoke-virtual {v2}, La/dbi;->b()La/ls;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, v0, La/qmi;->l:La/d1p;

    .line 16
    .line 17
    invoke-interface {v3}, La/d1p;->P0()La/gw60;

    .line 18
    .line 19
    .line 20
    move-result-object v12

    .line 21
    new-instance v3, La/uxs0;

    .line 22
    .line 23
    const/16 v4, 0xc

    .line 24
    .line 25
    invoke-direct {v3, v4}, La/uxs0;-><init>(B)V

    .line 26
    .line 27
    .line 28
    move-object v4, v1

    .line 29
    iget-object v1, v0, La/qmi;->a:La/mne;

    .line 30
    .line 31
    move-object/from16 v16, v3

    .line 32
    .line 33
    iget-object v3, v0, La/qmi;->c:La/p4u;

    .line 34
    .line 35
    move-object v5, v4

    .line 36
    iget-object v4, v0, La/qmi;->d:La/duj;

    .line 37
    .line 38
    move-object v6, v5

    .line 39
    iget-object v5, v0, La/qmi;->e:La/oeg0;

    .line 40
    .line 41
    move-object v7, v6

    .line 42
    iget-object v6, v0, La/qmi;->f:La/hs60;

    .line 43
    .line 44
    move-object v8, v7

    .line 45
    iget-object v7, v0, La/qmi;->g:La/iqt;

    .line 46
    .line 47
    move-object v9, v8

    .line 48
    iget-object v8, v0, La/qmi;->h:La/dcu;

    .line 49
    .line 50
    move-object v10, v9

    .line 51
    iget-object v9, v0, La/qmi;->i:La/as;

    .line 52
    .line 53
    move-object v11, v10

    .line 54
    iget-object v10, v0, La/qmi;->j:La/as;

    .line 55
    .line 56
    move-object v13, v11

    .line 57
    iget-object v11, v0, La/qmi;->k:La/z4u;

    .line 58
    .line 59
    move-object v14, v13

    .line 60
    iget-object v13, v0, La/qmi;->m:La/pru;

    .line 61
    .line 62
    move-object v15, v14

    .line 63
    iget-object v14, v0, La/qmi;->n:La/hnu;

    .line 64
    .line 65
    iget-object v0, v0, La/qmi;->o:La/ctf0;

    .line 66
    .line 67
    move-object/from16 v17, v15

    .line 68
    .line 69
    move-object v15, v0

    .line 70
    move-object/from16 v0, v17

    .line 71
    .line 72
    invoke-direct/range {v0 .. v16}, La/nn60;-><init>(La/mne;La/ls;La/p4u;La/duj;La/oeg0;La/hs60;La/iqt;La/dcu;La/as;La/as;La/z4u;La/gw60;La/pru;La/hnu;La/ctf0;La/uxs0;)V

    .line 73
    .line 74
    .line 75
    move-object v15, v0

    .line 76
    return-object v15
.end method

.method public final b()La/afm0;
    .locals 2

    .line 1
    new-instance v0, La/afm0;

    .line 2
    .line 3
    iget-object v1, p0, La/qmi;->p:La/wdk0;

    .line 4
    .line 5
    iget-object p0, p0, La/qmi;->q:La/ii;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, La/afm0;-><init>(La/wdk0;La/ii;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
