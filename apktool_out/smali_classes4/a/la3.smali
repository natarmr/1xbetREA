.class public final La/la3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/la3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/la3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/la3;->a:La/la3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(IZ)I
    .locals 0

    .line 1
    invoke-static {p1, p2}, Landroid/view/SoundEffectConstants;->getConstantForFocusDirection(IZ)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
