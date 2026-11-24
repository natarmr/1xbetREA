.class public final La/uzc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/q7d0;


# direct methods
.method public constructor <init>(La/q7d0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/uzc;->a:La/q7d0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, La/uzc;->b()La/jvn;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, La/jvn;->d:La/jvn;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final b()La/jvn;
    .locals 3

    .line 1
    sget-object v0, La/jvn;->a:La/pek;

    .line 2
    .line 3
    sget-object v1, La/jvn;->d:La/jvn;

    .line 4
    .line 5
    invoke-virtual {v1}, La/jvn;->getId()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object p0, p0, La/uzc;->a:La/q7d0;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v2, "COEF_TYPE_ID"

    .line 19
    .line 20
    invoke-interface {p0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, La/pek;->k(I)La/jvn;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final c()La/fnq;
    .locals 4

    .line 1
    new-instance v0, La/rzc;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, v2, v1}, La/rzc;-><init>(La/uzc;La/yje;B)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, La/nkb;->z(Lkotlin/jvm/functions/Function2;)La/ltb;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/c00;

    .line 13
    .line 14
    const/16 v3, 0x17

    .line 15
    .line 16
    invoke-direct {v1, v0, p0, v3}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance v0, La/rzc;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v0, p0, v2, v3}, La/rzc;-><init>(La/uzc;La/yje;B)V

    .line 23
    .line 24
    .line 25
    new-instance p0, La/fnq;

    .line 26
    .line 27
    invoke-direct {p0, v1, v0}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method
