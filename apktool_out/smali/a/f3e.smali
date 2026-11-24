.class public final La/f3e;
.super La/x0x;
.source "SourceFile"

# interfaces
.implements La/ep80;


# instance fields
.field public final b:La/u2e;

.field public final c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(La/u2e;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/f3e;->b:La/u2e;

    .line 5
    .line 6
    iput-object p2, p0, La/f3e;->c:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(La/w6k;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, La/e3e;

    .line 2
    .line 3
    iget-object v0, p0, La/f3e;->b:La/u2e;

    .line 4
    .line 5
    iget-object p0, p0, La/f3e;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0}, La/e3e;-><init>(La/u2e;Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, La/f3e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, La/f3e;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v1

    .line 10
    :goto_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object v1, p1, La/f3e;->c:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    :cond_1
    iget-object p0, p0, La/f3e;->c:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    if-ne p0, v1, :cond_2

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_2
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, La/f3e;->c:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
