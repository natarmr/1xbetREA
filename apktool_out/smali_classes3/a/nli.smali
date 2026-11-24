.class public final La/nli;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g8i;

.field public final b:La/tnc0;

.field public final c:La/wsf0;

.field public final d:La/rkc0;

.field public final e:La/fhj;

.field public final f:La/nli;

.field public final g:La/n5d0;

.field public final h:La/gji;


# direct methods
.method public constructor <init>(La/evz;La/g8i;La/wsf0;La/rkc0;La/tnc0;La/fhj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, La/nli;->f:La/nli;

    .line 5
    .line 6
    iput-object p2, p0, La/nli;->a:La/g8i;

    .line 7
    .line 8
    iput-object p5, p0, La/nli;->b:La/tnc0;

    .line 9
    .line 10
    iput-object p3, p0, La/nli;->c:La/wsf0;

    .line 11
    .line 12
    iput-object p4, p0, La/nli;->d:La/rkc0;

    .line 13
    .line 14
    iput-object p6, p0, La/nli;->e:La/fhj;

    .line 15
    .line 16
    new-instance p1, La/gji;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    const/4 p3, 0x7

    .line 20
    invoke-direct {p1, p0, p2, p3}, La/gji;-><init>(Ljava/lang/Object;IB)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, La/nli;->g:La/n5d0;

    .line 28
    .line 29
    new-instance p1, La/gji;

    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    invoke-direct {p1, p0, p2, p3}, La/gji;-><init>(Ljava/lang/Object;IB)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La/nli;->h:La/gji;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a()La/nvu;
    .locals 4

    .line 1
    new-instance v0, La/nvu;

    .line 2
    .line 3
    new-instance v1, La/zn00;

    .line 4
    .line 5
    iget-object p0, p0, La/nli;->a:La/g8i;

    .line 6
    .line 7
    invoke-virtual {p0}, La/g8i;->j9()La/gii0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    invoke-direct {v1, v2, v3}, La/zn00;-><init>(La/gii0;B)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/g8i;->o8()La/btt0;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, La/g8i;->J8()La/knf0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/16 v3, 0xa

    .line 33
    .line 34
    invoke-direct {v0, v1, v2, p0, v3}, La/nvu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method
