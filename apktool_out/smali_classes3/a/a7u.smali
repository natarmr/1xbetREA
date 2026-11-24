.class public final La/a7u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mii0;


# direct methods
.method public synthetic constructor <init>(La/mii0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/a7u;->a:La/mii0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/a7u;->a:La/mii0;

    .line 5
    .line 6
    iget-object p0, p0, La/mii0;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/hk3;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/io/File;

    .line 14
    .line 15
    iget-object p0, p0, La/hk3;->a:La/us00;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v1, ".CWAC-Update"

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 27
    .line 28
    .line 29
    new-instance p0, Ljava/io/File;

    .line 30
    .line 31
    invoke-static {p1}, La/hk3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Ljava/io/File;

    .line 39
    .line 40
    invoke-static {p1}, La/hk3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 48
    .line 49
    .line 50
    return-void
.end method
