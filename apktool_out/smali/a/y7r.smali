.class public final La/y7r;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final a:La/z7r;

.field public final b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(La/z7r;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/y7r;->a:La/z7r;

    .line 5
    .line 6
    iput-object p2, p0, La/y7r;->b:Ljava/lang/Throwable;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getCause()Ljava/lang/Throwable;
    .locals 0

    .line 1
    iget-object p0, p0, La/y7r;->b:Ljava/lang/Throwable;

    .line 2
    .line 3
    return-object p0
.end method
