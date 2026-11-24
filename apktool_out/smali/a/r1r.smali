.class public final La/r1r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final a:La/glz;

.field public final b:La/k4r;

.field public final c:La/n1r;


# direct methods
.method public constructor <init>(La/glz;La/k4r;La/n1r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/r1r;->a:La/glz;

    .line 5
    .line 6
    iput-object p2, p0, La/r1r;->b:La/k4r;

    .line 7
    .line 8
    iput-object p3, p0, La/r1r;->c:La/n1r;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/r1r;->b:La/k4r;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, La/k4r;->i(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
