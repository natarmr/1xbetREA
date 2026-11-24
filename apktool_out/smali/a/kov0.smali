.class public final La/kov0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zkz;


# instance fields
.field public final synthetic a:La/glz;

.field public final synthetic b:La/n5a;

.field public final synthetic c:La/nsr;


# direct methods
.method public constructor <init>(La/glz;La/n5a;La/nsr;)V
    .locals 1

    .line 1
    sget-object v0, La/lkz;->a:La/lkz;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/kov0;->a:La/glz;

    .line 7
    .line 8
    iput-object p2, p0, La/kov0;->b:La/n5a;

    .line 9
    .line 10
    iput-object p3, p0, La/kov0;->c:La/nsr;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final l(La/clz;La/kkz;)V
    .locals 2

    .line 1
    sget-object p1, La/kkz;->Companion:La/ikz;

    .line 2
    .line 3
    sget-object v0, La/lkz;->a:La/lkz;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object p1, La/kkz;->ON_RESUME:La/kkz;

    .line 9
    .line 10
    iget-object v0, p0, La/kov0;->b:La/n5a;

    .line 11
    .line 12
    iget-object v1, p0, La/kov0;->a:La/glz;

    .line 13
    .line 14
    if-ne p2, p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1, p0}, La/glz;->f(La/blz;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, La/kov0;->c:La/nsr;

    .line 20
    .line 21
    :try_start_0
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 22
    .line 23
    invoke-virtual {p0}, La/nsr;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 30
    .line 31
    new-instance p1, La/g0g0;

    .line 32
    .line 33
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p0, p1

    .line 37
    :goto_0
    invoke-virtual {v0, p0}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    sget-object p1, La/kkz;->ON_DESTROY:La/kkz;

    .line 42
    .line 43
    if-ne p2, p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1, p0}, La/glz;->f(La/blz;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 49
    .line 50
    new-instance p0, La/ukz;

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    const/4 p2, 0x0

    .line 54
    invoke-direct {p0, p1, p2}, La/ukz;-><init>(Ljava/lang/String;B)V

    .line 55
    .line 56
    .line 57
    new-instance p1, La/g0g0;

    .line 58
    .line 59
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void
.end method
