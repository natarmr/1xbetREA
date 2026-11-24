.class public final La/vvi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ii;

.field public final b:La/gii0;

.field public final c:La/knf0;

.field public final d:La/yvn0;

.field public final e:La/mne;

.field public final f:La/sjl0;

.field public final g:La/rou;

.field public final h:La/i1w0;

.field public final i:La/u3q;

.field public final j:La/g2v;

.field public final k:La/s31;

.field public final l:La/e41;

.field public final m:La/ctf0;

.field public final n:La/g9m0;

.field public final o:La/n5d0;


# direct methods
.method public constructor <init>(La/ii;La/i1w0;La/mne;La/gii0;La/knf0;La/yvn0;La/g9m0;La/u3q;La/sjl0;La/s31;La/g2v;La/e41;La/wdk0;La/rou;La/ctf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vvi;->a:La/ii;

    .line 5
    .line 6
    iput-object p4, p0, La/vvi;->b:La/gii0;

    .line 7
    .line 8
    iput-object p5, p0, La/vvi;->c:La/knf0;

    .line 9
    .line 10
    iput-object p6, p0, La/vvi;->d:La/yvn0;

    .line 11
    .line 12
    iput-object p3, p0, La/vvi;->e:La/mne;

    .line 13
    .line 14
    iput-object p9, p0, La/vvi;->f:La/sjl0;

    .line 15
    .line 16
    iput-object p14, p0, La/vvi;->g:La/rou;

    .line 17
    .line 18
    iput-object p2, p0, La/vvi;->h:La/i1w0;

    .line 19
    .line 20
    iput-object p8, p0, La/vvi;->i:La/u3q;

    .line 21
    .line 22
    iput-object p11, p0, La/vvi;->j:La/g2v;

    .line 23
    .line 24
    iput-object p10, p0, La/vvi;->k:La/s31;

    .line 25
    .line 26
    iput-object p12, p0, La/vvi;->l:La/e41;

    .line 27
    .line 28
    iput-object p15, p0, La/vvi;->m:La/ctf0;

    .line 29
    .line 30
    iput-object p7, p0, La/vvi;->n:La/g9m0;

    .line 31
    .line 32
    new-instance p1, La/rti;

    .line 33
    .line 34
    const/16 p2, 0x1d

    .line 35
    .line 36
    invoke-direct {p1, p0, p2}, La/rti;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, La/vvi;->o:La/n5d0;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a()La/z220;
    .locals 4

    .line 1
    new-instance v0, La/z220;

    .line 2
    .line 3
    new-instance v1, La/afm0;

    .line 4
    .line 5
    iget-object v2, p0, La/vvi;->b:La/gii0;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    invoke-direct {v1, v2, v3}, La/afm0;-><init>(La/gii0;B)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, La/vvi;->d:La/yvn0;

    .line 12
    .line 13
    iget-object v3, p0, La/vvi;->e:La/mne;

    .line 14
    .line 15
    iget-object p0, p0, La/vvi;->c:La/knf0;

    .line 16
    .line 17
    invoke-direct {v0, v1, p0, v2, v3}, La/z220;-><init>(La/afm0;La/knf0;La/yvn0;La/mne;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
