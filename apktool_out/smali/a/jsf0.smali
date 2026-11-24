.class public final La/jsf0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La/jsf0;


# instance fields
.field public a:Landroid/util/Size;

.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/jsf0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, La/jsf0;->a:Landroid/util/Size;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-boolean v1, v0, La/jsf0;->b:Z

    .line 11
    .line 12
    sput-object v0, La/jsf0;->c:La/jsf0;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Landroid/util/Size;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jsf0;->a:Landroid/util/Size;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, La/jsf0;->b:Z

    .line 8
    .line 9
    return-void
.end method
