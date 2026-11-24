.class public final La/nm8;
.super La/wvb0;
.source "SourceFile"


# static fields
.field public static final c:La/nm8;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/nm8;

    .line 2
    .line 3
    sget-object v1, La/rm8;->a:La/rm8;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, La/sm8;->a:La/sm8;

    .line 9
    .line 10
    invoke-direct {v0, v1}, La/wvb0;-><init>(La/jiy;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/nm8;->c:La/nm8;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, [Z

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    array-length p0, p1

    .line 7
    return p0
.end method

.method public final f(La/bld;ILjava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p3, La/lm8;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/wvb0;->b:La/vvb0;

    .line 7
    .line 8
    invoke-interface {p1, p0, p2}, La/bld;->B(La/ugi0;I)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-static {p3}, La/uvb0;->c(La/uvb0;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p3, La/lm8;->a:[Z

    .line 16
    .line 17
    iget p2, p3, La/lm8;->b:I

    .line 18
    .line 19
    add-int/lit8 v0, p2, 0x1

    .line 20
    .line 21
    iput v0, p3, La/lm8;->b:I

    .line 22
    .line 23
    aput-boolean p0, p1, p2

    .line 24
    .line 25
    return-void
.end method
