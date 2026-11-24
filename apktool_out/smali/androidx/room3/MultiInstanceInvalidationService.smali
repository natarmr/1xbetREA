.class public final Landroidx/room3/MultiInstanceInvalidationService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:La/yv40;

.field public final d:La/wv40;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/room3/MultiInstanceInvalidationService;->b:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    new-instance v0, La/yv40;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/yv40;-><init>(Landroid/app/Service;B)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/room3/MultiInstanceInvalidationService;->c:La/yv40;

    .line 18
    .line 19
    new-instance v0, La/wv40;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/wv40;-><init>(Landroidx/room3/MultiInstanceInvalidationService;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/room3/MultiInstanceInvalidationService;->d:La/wv40;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room3/MultiInstanceInvalidationService;->d:La/wv40;

    .line 2
    .line 3
    return-object p0
.end method
