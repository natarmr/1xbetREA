.class public final La/srd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/regex/Pattern;

.field public static final f:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/util/HashSet;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:La/krd;

.field public final d:La/krd;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    const-string v0, "^(1|true|t|yes|y|on)$"

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, La/srd;->e:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    const-string v0, "^(0|false|f|no|n|off|)$"

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, La/srd;->f:Ljava/util/regex/Pattern;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;La/krd;La/krd;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/srd;->a:Ljava/util/HashSet;

    .line 10
    .line 11
    iput-object p1, p0, La/srd;->b:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    iput-object p2, p0, La/srd;->c:La/krd;

    .line 14
    .line 15
    iput-object p3, p0, La/srd;->d:La/krd;

    .line 16
    .line 17
    return-void
.end method

.method public static a(La/krd;)Ljava/util/HashSet;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/krd;->c()La/mrd;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object p0, p0, La/mrd;->b:Lorg/json/JSONObject;

    .line 14
    .line 15
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    return-object v0
.end method
