.class public final La/rnm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ze3;


# instance fields
.field public final a:La/pru;

.field public final b:La/fsd;

.field public final c:La/tnm0;

.field public final d:La/kt2;

.field public final e:La/ctf0;

.field public final f:La/au0;


# direct methods
.method public constructor <init>(La/pru;La/fsd;La/tnm0;La/kt2;La/ctf0;La/au0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/rnm0;->a:La/pru;

    .line 17
    .line 18
    iput-object p2, p0, La/rnm0;->b:La/fsd;

    .line 19
    .line 20
    iput-object p3, p0, La/rnm0;->c:La/tnm0;

    .line 21
    .line 22
    iput-object p4, p0, La/rnm0;->d:La/kt2;

    .line 23
    .line 24
    iput-object p5, p0, La/rnm0;->e:La/ctf0;

    .line 25
    .line 26
    iput-object p6, p0, La/rnm0;->f:La/au0;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(La/s77;La/i1w0;La/sys0;)La/ru;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/rnm0;->b:La/fsd;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/rnm0;->c:La/tnm0;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, La/rnm0;->d:La/kt2;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, La/rnm0;->e:La/ctf0;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v3, La/ru;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, v3, La/ru;->a:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object p3, v3, La/ru;->b:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object v0, v3, La/ru;->c:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object p1, p0, La/rnm0;->a:La/pru;

    .line 36
    .line 37
    iput-object p1, v3, La/ru;->d:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object v1, v3, La/ru;->f:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object v2, v3, La/ru;->e:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object p0, p0, La/rnm0;->f:La/au0;

    .line 44
    .line 45
    iput-object p0, v3, La/ru;->g:Ljava/lang/Object;

    .line 46
    .line 47
    iput-object p2, v3, La/ru;->h:Ljava/lang/Object;

    .line 48
    .line 49
    new-instance p0, La/msi;

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    const/4 p2, 0x4

    .line 53
    invoke-direct {p0, v3, p1, p2}, La/msi;-><init>(Ljava/lang/Object;IB)V

    .line 54
    .line 55
    .line 56
    iput-object p0, v3, La/ru;->i:Ljava/lang/Object;

    .line 57
    .line 58
    new-instance p0, La/msi;

    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    invoke-direct {p0, v3, p1, p2}, La/msi;-><init>(Ljava/lang/Object;IB)V

    .line 62
    .line 63
    .line 64
    iput-object p0, v3, La/ru;->j:Ljava/lang/Object;

    .line 65
    .line 66
    return-object v3
.end method
