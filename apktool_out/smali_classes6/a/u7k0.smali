.class public final La/u7k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(ZLkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/u7k0;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, La/u7k0;->b:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "SizeTransform(clip="

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    iget-boolean p0, p0, La/u7k0;->a:Z

    .line 6
    .line 7
    invoke-static {v0, v1, p0}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
