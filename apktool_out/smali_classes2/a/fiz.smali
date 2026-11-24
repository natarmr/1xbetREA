.class public final La/fiz;
.super La/j;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/fiz;->e:Ljava/util/ArrayList;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La/ar20;II)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3}, La/j;-><init>(La/ar20;II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
