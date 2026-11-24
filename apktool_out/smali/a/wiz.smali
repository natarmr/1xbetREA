.class public final La/wiz;
.super Landroid/view/LayoutInflater;
.source "SourceFile"


# static fields
.field public static final a:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/w7f;->k:La/w7f;

    .line 2
    .line 3
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/wiz;->a:La/n0o0;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/view/LayoutInflater;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, La/wiz;

    .line 5
    .line 6
    invoke-direct {p0, p1}, La/wiz;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method
