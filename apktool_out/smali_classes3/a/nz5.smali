.class public final La/nz5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "Z::",
        "La/kuw;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final Companion:La/jz5;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:La/mz5;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/jz5;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/nz5;->Companion:La/jz5;

    .line 7
    .line 8
    new-instance v0, La/zna0;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x2

    .line 12
    const-string v3, "org.xplatform.core.data.BaseJsonResponse"

    .line 13
    .line 14
    invoke-direct {v0, v3, v1, v2}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v1, "data"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v0, v1, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v1, "error"

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;La/mz5;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, La/nz5;->a:Ljava/lang/Object;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, La/nz5;->a:Ljava/lang/Object;

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p1, p1, 0x2

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, La/nz5;->b:La/mz5;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iput-object p3, p0, La/nz5;->b:La/mz5;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/nz5;->b:La/mz5;

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    new-instance p0, La/zhi0;

    .line 7
    .line 8
    iget-object v2, v1, La/mz5;->b:Ljava/lang/String;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    const-string v2, ""

    .line 13
    .line 14
    :cond_0
    iget-object v1, v1, La/mz5;->d:La/kuw;

    .line 15
    .line 16
    const/16 v3, 0xc

    .line 17
    .line 18
    invoke-direct {p0, v2, v1, v0, v3}, La/zhi0;-><init>(Ljava/lang/String;La/kuw;Ljava/lang/Integer;I)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :cond_1
    iget-object p0, p0, La/nz5;->a:Ljava/lang/Object;

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    invoke-static {v0}, La/jf4;->k(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method
