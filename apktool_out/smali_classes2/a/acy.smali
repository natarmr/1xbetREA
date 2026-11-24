.class public final La/acy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/acy;

.field public static final b:La/zby;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/acy;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/acy;->a:La/acy;

    .line 7
    .line 8
    sget-object v0, La/zby;->b:La/zby;

    .line 9
    .line 10
    sput-object v0, La/acy;->b:La/zby;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, La/fww;->t(La/rkj;)La/icy;

    .line 2
    .line 3
    .line 4
    new-instance p0, La/yby;

    .line 5
    .line 6
    sget-object v0, La/qcy;->a:La/qcy;

    .line 7
    .line 8
    new-instance v1, La/zw3;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1}, La/v1;->e(La/rkj;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/util/List;

    .line 19
    .line 20
    invoke-direct {p0, p1}, La/yby;-><init>(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/acy;->b:La/zby;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/yby;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, La/fww;->u(La/bwn;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, La/qcy;->a:La/qcy;

    .line 10
    .line 11
    new-instance v0, La/uw3;

    .line 12
    .line 13
    invoke-interface {p0}, La/jiy;->getDescriptor()La/ugi0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v0, v1, v2}, La/uw3;-><init>(La/ugi0;B)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-interface {p1, v0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    const/4 v2, 0x0

    .line 37
    :goto_0
    if-ge v2, v1, :cond_0

    .line 38
    .line 39
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {p1, v0, v2, p0, v3}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-interface {p1, v0}, La/cld;->c(La/ugi0;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
