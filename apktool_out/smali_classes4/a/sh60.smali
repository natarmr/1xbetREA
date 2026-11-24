.class public final enum La/sh60;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/sh60;

.field public static final synthetic c:[La/sh60;

.field public static final synthetic d:La/c0o;


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/sh60;

    .line 2
    .line 3
    sget-object v1, La/skb0;->g:La/c0o;

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/sh60;-><init>(La/c0o;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/sh60;->b:La/sh60;

    .line 9
    .line 10
    filled-new-array {v0}, [La/sh60;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, La/sh60;->c:[La/sh60;

    .line 15
    .line 16
    new-instance v1, La/c0o;

    .line 17
    .line 18
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, La/sh60;->d:La/c0o;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(La/c0o;)V
    .locals 2

    .line 1
    const-string v0, "PopularSports"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/sh60;->a:Ljava/util/List;

    .line 8
    .line 9
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/sh60;
    .locals 1

    .line 1
    const-class v0, La/sh60;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/sh60;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/sh60;
    .locals 1

    .line 1
    sget-object v0, La/sh60;->c:[La/sh60;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/sh60;

    .line 8
    .line 9
    return-object v0
.end method
