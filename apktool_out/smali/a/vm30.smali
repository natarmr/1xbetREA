.class public final La/vm30;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Z

.field public c:La/dwj;

.field public d:S

.field public e:Landroid/os/Handler;

.field public f:La/qlo;

.field public g:B


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vm30;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v0, La/dwj;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, v1}, La/dwj;-><init>(Landroid/content/Context;B)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/vm30;->c:La/dwj;

    .line 13
    .line 14
    return-void
.end method
