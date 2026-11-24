.class public final La/qbx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/miu0;


# instance fields
.field public final a:[La/iiu0;


# direct methods
.method public varargs constructor <init>([La/iiu0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qbx;->a:[La/iiu0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Class;La/by40;)La/diu0;
    .locals 5

    .line 1
    sget-object v0, La/sre0;->a:La/tre0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, La/qbx;->a:[La/iiu0;

    .line 8
    .line 9
    array-length v0, p0

    .line 10
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, [La/iiu0;

    .line 15
    .line 16
    array-length v0, p0

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    const/4 v2, 0x0

    .line 19
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    aget-object v3, p0, v1

    .line 22
    .line 23
    iget-object v4, v3, La/iiu0;->a:La/sgy;

    .line 24
    .line 25
    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v3, v2

    .line 36
    :goto_1
    if-eqz v3, :cond_2

    .line 37
    .line 38
    iget-object p0, v3, La/iiu0;->b:Lkotlin/jvm/functions/Function1;

    .line 39
    .line 40
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/diu0;

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move-object p0, v2

    .line 48
    :goto_2
    if-eqz p0, :cond_3

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_3
    invoke-interface {p1}, La/sgy;->v()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string p1, "No initializer set for given class "

    .line 56
    .line 57
    invoke-static {p1, p0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-object v2
.end method
