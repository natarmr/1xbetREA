.class public final La/miw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lin0;


# static fields
.field public static final b:La/miw0;


# instance fields
.field public final a:La/oin0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/miw0;

    .line 2
    .line 3
    invoke-direct {v0}, La/miw0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/miw0;->b:La/miw0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/oiw0;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/oin0;

    .line 10
    .line 11
    invoke-direct {v1, v0}, La/oin0;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, La/miw0;->a:La/oin0;

    .line 15
    .line 16
    return-void
.end method

.method public static a()V
    .locals 1

    .line 1
    sget-object v0, La/miw0;->b:La/miw0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/miw0;->b()La/oiw0;

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()La/oiw0;
    .locals 0

    .line 1
    iget-object p0, p0, La/miw0;->a:La/oin0;

    .line 2
    .line 3
    iget-object p0, p0, La/oin0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/oiw0;

    .line 6
    .line 7
    return-object p0
.end method

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/miw0;->b()La/oiw0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
