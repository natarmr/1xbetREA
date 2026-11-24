.class public final La/zua;
.super La/w8b;
.source "SourceFile"


# static fields
.field public static final d:La/zua;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/zua;

    .line 2
    .line 3
    new-instance v1, La/h9b;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-direct {v1, v2}, La/h9b;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/16 v3, 0x1e

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v2, v3}, La/w8b;-><init>(La/h9b;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/zua;->d:La/zua;

    .line 17
    .line 18
    return-void
.end method
