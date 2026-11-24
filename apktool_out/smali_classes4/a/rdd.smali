.class public final La/rdd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/nv20;


# direct methods
.method public synthetic constructor <init>(La/nv20;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/rdd;->a:La/nv20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/sh60;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/rdd;->a:La/nv20;

    .line 5
    .line 6
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/tj60;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/tj60;->a:La/q7d0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v3, "KEY_ONBOARDING_COMPLETED_"

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-virtual {v0, v1, v2}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, La/tj60;->b:La/p7m0;

    .line 38
    .line 39
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    move-object v2, v1

    .line 44
    check-cast v2, La/tk60;

    .line 45
    .line 46
    sget-object v3, La/qk60;->a:La/qk60;

    .line 47
    .line 48
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    instance-of v4, v2, La/rk60;

    .line 56
    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    move-object v4, v2

    .line 60
    check-cast v4, La/rk60;

    .line 61
    .line 62
    iget-object v4, v4, La/rk60;->a:La/sh60;

    .line 63
    .line 64
    if-ne v4, p1, :cond_2

    .line 65
    .line 66
    iget-object v2, p0, La/tj60;->c:La/p7m0;

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-virtual {v2, v4}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object v2, v3

    .line 73
    :cond_2
    :goto_0
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_0

    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 81
    .line 82
    .line 83
    return-void
.end method
