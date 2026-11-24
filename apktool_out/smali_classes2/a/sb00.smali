.class public final La/sb00;
.super La/ir20;
.source "SourceFile"


# instance fields
.field public final f:I


# direct methods
.method public constructor <init>(La/v9d;La/y78;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2, p1}, La/ir20;-><init>(La/y78;La/v9d;)V

    .line 5
    .line 6
    .line 7
    iput p3, p0, La/sb00;->f:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final b(La/k810;)I
    .locals 0

    .line 1
    iget p0, p0, La/sb00;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public final c(La/v9d;La/k810;)La/hr20;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p1, p2, La/k810;->c:I

    .line 5
    .line 6
    iget p0, p0, La/sb00;->f:I

    .line 7
    .line 8
    if-ge p1, p0, :cond_0

    .line 9
    .line 10
    sget-object p0, La/hr20;->e:La/hr20;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object p0, La/hr20;->f:La/hr20;

    .line 14
    .line 15
    return-object p0
.end method

.method public final d()La/ar20;
    .locals 0

    .line 1
    sget-object p0, La/wb;->y:La/ar20;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(La/k810;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
