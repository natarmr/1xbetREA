.class public final La/mgy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ypy;


# static fields
.field public static final b:La/zpy;


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/zpy;

    .line 2
    .line 3
    const-class v1, La/mgy;

    .line 4
    .line 5
    sget-object v2, La/sre0;->a:La/tre0;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, La/zpy;-><init>(La/sgy;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/mgy;->b:La/zpy;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/mgy;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final getType()La/zpy;
    .locals 0

    .line 1
    sget-object p0, La/mgy;->b:La/zpy;

    .line 2
    .line 3
    return-object p0
.end method
