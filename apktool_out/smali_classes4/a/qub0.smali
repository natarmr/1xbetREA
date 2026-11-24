.class public final La/qub0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/m1e;


# static fields
.field public static final a:La/qub0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/qub0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/qub0;->a:La/qub0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()La/gmq;
    .locals 2

    .line 1
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v0, La/eu4;

    .line 4
    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final b()La/gmq;
    .locals 2

    .line 1
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v0, La/eu4;

    .line 4
    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final c()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final d()V
    .locals 0

    .line 1
    return-void
.end method
