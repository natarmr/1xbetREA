.class public final La/qct;
.super Ljava/lang/RuntimeException;
.source "SourceFile"

# interfaces
.implements La/alx;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/l5t;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/l5t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qct;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, La/qct;->b:La/l5t;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/qct;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
