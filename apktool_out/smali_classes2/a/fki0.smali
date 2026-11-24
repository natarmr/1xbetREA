.class public final synthetic La/fki0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:La/ywq0;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/ywq0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fki0;->a:La/ywq0;

    iput-object p2, p0, La/fki0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/fki0;->b:Ljava/lang/String;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Integer;

    .line 4
    .line 5
    iget-object p0, p0, La/fki0;->a:La/ywq0;

    .line 6
    .line 7
    iget-object p0, p0, La/ywq0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/x9f;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    new-instance v1, La/f25;

    .line 16
    .line 17
    invoke-direct {v1, p1}, La/f25;-><init>(I)V

    .line 18
    .line 19
    .line 20
    new-instance p1, La/e25;

    .line 21
    .line 22
    invoke-direct {p1, v1}, La/e25;-><init>(La/f25;)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    sget-object v1, La/x9f;->g:La/v9f;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v1, La/v9f;->a:La/g2v;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, La/g2v;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p0, p0, La/x9f;->b:La/xzp;

    .line 37
    .line 38
    const-string v1, "profiling-manager-info"

    .line 39
    .line 40
    invoke-virtual {p0, v0, v1}, La/xzp;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0, p1}, La/x9f;->g(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catch_0
    move-exception p0

    .line 49
    new-instance p1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "Could not persist Profiling Manager info "

    .line 52
    .line 53
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v0, "FirebaseCrashlytics"

    .line 64
    .line 65
    invoke-static {v0, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 66
    .line 67
    .line 68
    return-void
.end method
