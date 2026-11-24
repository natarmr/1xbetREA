.class public final La/slg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ze3;


# instance fields
.field public final a:La/d1p;

.field public final b:La/kt2;

.field public final c:La/g2v;

.field public final d:La/m1e;

.field public final e:La/nv20;

.field public final f:La/mne;

.field public final g:La/duj;

.field public final h:La/wdk0;

.field public final i:La/ctf0;

.field public final j:La/grj;

.field public final k:La/rl1;

.field public final l:La/bzt;


# direct methods
.method public constructor <init>(La/d1p;La/kt2;La/g2v;La/sa10;La/m1e;La/nv20;La/mne;La/duj;La/wdk0;La/ctf0;La/grj;La/rl1;La/bzt;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/slg0;->a:La/d1p;

    .line 20
    .line 21
    iput-object p2, p0, La/slg0;->b:La/kt2;

    .line 22
    .line 23
    iput-object p3, p0, La/slg0;->c:La/g2v;

    .line 24
    .line 25
    iput-object p5, p0, La/slg0;->d:La/m1e;

    .line 26
    .line 27
    iput-object p6, p0, La/slg0;->e:La/nv20;

    .line 28
    .line 29
    iput-object p7, p0, La/slg0;->f:La/mne;

    .line 30
    .line 31
    iput-object p8, p0, La/slg0;->g:La/duj;

    .line 32
    .line 33
    iput-object p9, p0, La/slg0;->h:La/wdk0;

    .line 34
    .line 35
    iput-object p10, p0, La/slg0;->i:La/ctf0;

    .line 36
    .line 37
    iput-object p11, p0, La/slg0;->j:La/grj;

    .line 38
    .line 39
    iput-object p12, p0, La/slg0;->k:La/rl1;

    .line 40
    .line 41
    iput-object p13, p0, La/slg0;->l:La/bzt;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(ZLa/i1w0;La/gmg0;)La/nsi;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, La/slg0;->k:La/rl1;

    .line 9
    .line 10
    move-object v11, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v11, p2

    .line 13
    .line 14
    :goto_0
    iget-object v4, v0, La/slg0;->a:La/d1p;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v7, v0, La/slg0;->b:La/kt2;

    .line 20
    .line 21
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v9, v0, La/slg0;->d:La/m1e;

    .line 25
    .line 26
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v13, v0, La/slg0;->h:La/wdk0;

    .line 30
    .line 31
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v15, v0, La/slg0;->i:La/ctf0;

    .line 35
    .line 36
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v2, La/nsi;

    .line 40
    .line 41
    iget-object v5, v0, La/slg0;->e:La/nv20;

    .line 42
    .line 43
    iget-object v6, v0, La/slg0;->l:La/bzt;

    .line 44
    .line 45
    iget-object v8, v0, La/slg0;->c:La/g2v;

    .line 46
    .line 47
    iget-object v10, v0, La/slg0;->f:La/mne;

    .line 48
    .line 49
    iget-object v12, v0, La/slg0;->g:La/duj;

    .line 50
    .line 51
    iget-object v14, v0, La/slg0;->j:La/grj;

    .line 52
    .line 53
    move-object/from16 v3, p3

    .line 54
    .line 55
    invoke-direct/range {v2 .. v15}, La/nsi;-><init>(La/gmg0;La/d1p;La/nv20;La/bzt;La/kt2;La/g2v;La/m1e;La/mne;La/i1w0;La/duj;La/wdk0;La/grj;La/ctf0;)V

    .line 56
    .line 57
    .line 58
    return-object v2
.end method
