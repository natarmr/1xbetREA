.class public final La/bgk0;
.super La/e8m0;
.source "SourceFile"


# instance fields
.field public c:I


# direct methods
.method public constructor <init>(JI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, La/e8m0;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, La/bgk0;->c:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/e8m0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, La/bgk0;

    .line 5
    .line 6
    iget p1, p1, La/bgk0;->c:I

    .line 7
    .line 8
    iput p1, p0, La/bgk0;->c:I

    .line 9
    .line 10
    return-void
.end method

.method public final b(J)La/e8m0;
    .locals 1

    .line 1
    new-instance v0, La/bgk0;

    .line 2
    .line 3
    iget p0, p0, La/bgk0;->c:I

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p0}, La/bgk0;-><init>(JI)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
