.class public abstract La/qr00;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/lqd;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/ejd;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    sget-object v2, La/rr00;->a:La/evz;

    .line 5
    .line 6
    invoke-direct {v0, v2, v1}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/lqd;

    .line 10
    .line 11
    invoke-direct {v1, v0}, La/lqd;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/qr00;->a:La/lqd;

    .line 15
    .line 16
    return-void
.end method

.method public static a(La/fet;)La/ze50;
    .locals 3

    .line 1
    sget-object v0, La/qr00;->a:La/lqd;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/ze50;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    const v0, 0x38ac99d4

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/fet;->e0(I)V

    .line 16
    .line 17
    .line 18
    sget-object v0, La/dy2;->b:La/zfn;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/content/Context;

    .line 25
    .line 26
    :goto_0
    instance-of v2, v0, Landroid/content/ContextWrapper;

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    instance-of v2, v0, La/ze50;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_1
    check-cast v0, La/ze50;

    .line 44
    .line 45
    :goto_2
    invoke-virtual {p0, v1}, La/fet;->r(Z)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    const v2, 0x38ac9423

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v2}, La/fet;->e0(I)V

    .line 53
    .line 54
    .line 55
    goto :goto_2
.end method
