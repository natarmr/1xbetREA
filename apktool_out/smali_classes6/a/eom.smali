.class public final La/eom;
.super La/um40;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/um40;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "La/eom;",
        "La/um40;",
        "La/tom;",
        "uikit"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Z

.field public final c:Lkotlin/jvm/functions/Function0;

.field public final d:Z

.field public final e:La/wom;


# direct methods
.method public constructor <init>(ZLkotlin/jvm/functions/Function0;ZLa/wom;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, La/eom;->b:Z

    .line 8
    .line 9
    iput-object p2, p0, La/eom;->c:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    iput-boolean p3, p0, La/eom;->d:Z

    .line 12
    .line 13
    iput-object p4, p0, La/eom;->e:La/wom;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/eom;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_1
    check-cast p1, La/eom;

    .line 11
    .line 12
    iget-boolean v0, p1, La/eom;->b:Z

    .line 13
    .line 14
    iget-boolean v2, p0, La/eom;->b:Z

    .line 15
    .line 16
    if-ne v2, v0, :cond_3

    .line 17
    .line 18
    iget-boolean v0, p0, La/eom;->d:Z

    .line 19
    .line 20
    iget-boolean v2, p1, La/eom;->d:Z

    .line 21
    .line 22
    if-ne v0, v2, :cond_3

    .line 23
    .line 24
    iget-object v0, p0, La/eom;->c:Lkotlin/jvm/functions/Function0;

    .line 25
    .line 26
    iget-object v2, p1, La/eom;->c:Lkotlin/jvm/functions/Function0;

    .line 27
    .line 28
    if-ne v0, v2, :cond_3

    .line 29
    .line 30
    iget-object p0, p0, La/eom;->e:La/wom;

    .line 31
    .line 32
    iget-object p1, p1, La/eom;->e:La/wom;

    .line 33
    .line 34
    if-eq p0, p1, :cond_2

    .line 35
    .line 36
    return v1

    .line 37
    :cond_2
    const/high16 p0, 0x42a00000    # 80.0f

    .line 38
    .line 39
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_3

    .line 44
    .line 45
    :goto_0
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final f()La/lm40;
    .locals 4

    .line 1
    new-instance v0, La/tom;

    .line 2
    .line 3
    iget-boolean v1, p0, La/eom;->d:Z

    .line 4
    .line 5
    iget-object v2, p0, La/eom;->e:La/wom;

    .line 6
    .line 7
    iget-boolean v3, p0, La/eom;->b:Z

    .line 8
    .line 9
    iget-object p0, p0, La/eom;->c:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    invoke-direct {v0, v3, p0, v1, v2}, La/tom;-><init>(ZLkotlin/jvm/functions/Function0;ZLa/wom;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 3

    .line 1
    check-cast p1, La/tom;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/eom;->c:Lkotlin/jvm/functions/Function0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iput-object v0, p1, La/tom;->r:Lkotlin/jvm/functions/Function0;

    .line 12
    .line 13
    iget-boolean v0, p0, La/eom;->d:Z

    .line 14
    .line 15
    iput-boolean v0, p1, La/tom;->s:Z

    .line 16
    .line 17
    iget-object v0, p0, La/eom;->e:La/wom;

    .line 18
    .line 19
    iput-object v0, p1, La/tom;->t:La/wom;

    .line 20
    .line 21
    const/high16 v0, 0x42a00000    # 80.0f

    .line 22
    .line 23
    iput v0, p1, La/tom;->u:F

    .line 24
    .line 25
    iget-boolean v0, p1, La/tom;->q:Z

    .line 26
    .line 27
    iget-boolean p0, p0, La/eom;->b:Z

    .line 28
    .line 29
    if-eq v0, p0, :cond_0

    .line 30
    .line 31
    iput-boolean p0, p1, La/tom;->q:Z

    .line 32
    .line 33
    invoke-virtual {p1}, La/lm40;->N0()La/vne;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-instance v0, La/ya;

    .line 38
    .line 39
    const/16 v1, 0x1c

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-direct {v0, p1, v2, v1}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x3

    .line 46
    invoke-static {p0, v2, v2, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/eom;->b:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-boolean v2, p0, La/eom;->d:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/eom;->c:Lkotlin/jvm/functions/Function0;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-object p0, p0, La/eom;->e:La/wom;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v2

    .line 31
    mul-int/2addr p0, v1

    .line 32
    const/high16 v0, 0x42a00000    # 80.0f

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/2addr v0, p0

    .line 39
    return v0
.end method
