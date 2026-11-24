.class public final La/dx5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final Companion:La/cx5;


# instance fields
.field public final a:La/uhi0;

.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/cx5;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/dx5;->Companion:La/cx5;

    .line 7
    .line 8
    new-instance v0, La/zna0;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x2

    .line 12
    const-string v3, "org.xplatform.onexcore.data.model.BaseDataResponse"

    .line 13
    .line 14
    invoke-direct {v0, v3, v1, v2}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v1, "error"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v0, v1, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v1, "data"

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public synthetic constructor <init>(ILa/uhi0;Ljava/lang/Object;)V
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
    iput-object v1, p0, La/dx5;->a:La/uhi0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, La/dx5;->a:La/uhi0;

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p1, p1, 0x2

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, La/dx5;->b:Ljava/lang/Object;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iput-object p3, p0, La/dx5;->b:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La/dx5;->a:La/uhi0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, La/dx5;->b:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    invoke-static {p0}, La/jf4;->k(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    new-instance p0, La/zhi0;

    .line 16
    .line 17
    invoke-direct {p0, v0}, La/zhi0;-><init>(La/uhi0;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method
