.class public final La/o1o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ym40;


# static fields
.field public static final a:La/o1o;

.field public static final b:La/g950;

.field public static final c:La/iun;

.field public static final d:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/o1o;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/o1o;->a:La/o1o;

    .line 7
    .line 8
    sget-object v0, La/b1o;->a:[La/b1o;

    .line 9
    .line 10
    const-string v0, "<Error module>"

    .line 11
    .line 12
    invoke-static {v0}, La/g950;->i(Ljava/lang/String;)La/g950;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, La/o1o;->b:La/g950;

    .line 17
    .line 18
    sget-object v0, La/iun;->a:La/iun;

    .line 19
    .line 20
    sput-object v0, La/o1o;->c:La/iun;

    .line 21
    .line 22
    sget-object v0, La/pul;->i:La/pul;

    .line 23
    .line 24
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, La/o1o;->d:La/n0o0;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final Y()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/o1o;->c:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Z(La/ym40;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return p0
.end method

.method public final a()La/vjj;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final c()La/ary;
    .locals 0

    .line 1
    sget-object p0, La/o1o;->d:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ary;

    .line 8
    .line 9
    return-object p0
.end method

.method public final c0(La/swq;)La/gdz;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string p1, "Should not be called!"

    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public final getAnnotations()La/g93;
    .locals 0

    .line 1
    sget-object p0, La/ujn;->c:La/f93;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()La/g950;
    .locals 0

    .line 1
    sget-object p0, La/o1o;->b:La/g950;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h0(La/pfw;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final i0(La/zjj;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final j()La/vjj;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final n(La/swq;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/iun;->a:La/iun;

    .line 5
    .line 6
    return-object p0
.end method
