.class public final La/abe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final a:La/fvk;


# direct methods
.method public constructor <init>(La/fvk;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/abe0;->a:La/fvk;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, La/abe0;->a:La/fvk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/fvk;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
