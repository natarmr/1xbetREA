.class public final La/rci;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/pai;


# direct methods
.method public constructor <init>(La/pai;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rci;->a:La/pai;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 14

    .line 1
    new-instance v0, La/m1l0;

    .line 2
    .line 3
    iget-object p0, p0, La/rci;->a:La/pai;

    .line 4
    .line 5
    iget-object p0, p0, La/pai;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/sci;

    .line 8
    .line 9
    iget-object v2, p0, La/sci;->b:La/ctf0;

    .line 10
    .line 11
    iget-object v3, p0, La/sci;->c:La/i1w0;

    .line 12
    .line 13
    iget-object v4, p0, La/sci;->d:La/duj;

    .line 14
    .line 15
    new-instance v5, La/cmt;

    .line 16
    .line 17
    iget-object v1, p0, La/sci;->e:La/c5k;

    .line 18
    .line 19
    const/16 v6, 0xa

    .line 20
    .line 21
    invoke-direct {v5, v1, v6}, La/cmt;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    new-instance v6, La/f4u;

    .line 25
    .line 26
    const/16 v7, 0x10

    .line 27
    .line 28
    invoke-direct {v6, v1, v7}, La/f4u;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance v7, La/drm0;

    .line 32
    .line 33
    invoke-direct {v7, v1}, La/drm0;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v8, p0, La/sci;->f:La/ouu;

    .line 37
    .line 38
    new-instance v9, La/bzs0;

    .line 39
    .line 40
    const/4 v1, 0x5

    .line 41
    invoke-direct {v9, v1}, La/bzs0;-><init>(B)V

    .line 42
    .line 43
    .line 44
    iget-object v10, p0, La/sci;->g:La/g2v;

    .line 45
    .line 46
    iget-object v11, p0, La/sci;->h:La/gle0;

    .line 47
    .line 48
    iget-object v12, p0, La/sci;->i:La/m1e;

    .line 49
    .line 50
    iget-object p0, p0, La/sci;->j:La/cad;

    .line 51
    .line 52
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/psc;

    .line 55
    .line 56
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 57
    .line 58
    .line 59
    move-result-object v13

    .line 60
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v1, p1

    .line 64
    invoke-direct/range {v0 .. v13}, La/m1l0;-><init>(La/vzg0;La/ctf0;La/i1w0;La/duj;La/cmt;La/f4u;La/drm0;La/ouu;La/bzs0;La/g2v;La/gle0;La/m1e;La/mne;)V

    .line 65
    .line 66
    .line 67
    return-object v0
.end method
