.class public final La/b5n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/e5n0;

.field public b:La/r7z;

.field public final c:La/y4n0;

.field public final d:La/y4n0;

.field public final e:La/y4n0;


# direct methods
.method public constructor <init>(La/e5n0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/b5n0;->a:La/e5n0;

    .line 5
    .line 6
    new-instance p1, La/y4n0;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, La/y4n0;-><init>(La/b5n0;B)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/b5n0;->c:La/y4n0;

    .line 13
    .line 14
    new-instance p1, La/y4n0;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {p1, p0, v0}, La/y4n0;-><init>(La/b5n0;B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/b5n0;->d:La/y4n0;

    .line 21
    .line 22
    new-instance p1, La/y4n0;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, v0}, La/y4n0;-><init>(La/b5n0;B)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/b5n0;->e:La/y4n0;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()La/r7z;
    .locals 0

    .line 1
    iget-object p0, p0, La/b5n0;->b:La/r7z;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "SubcomposeLayoutState is not attached to SubcomposeLayout"

    .line 7
    .line 8
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method
